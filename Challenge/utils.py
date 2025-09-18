import torch
import torch.nn as nn
from torchvision import models,transforms

class PreprocessedDataset(torch.utils.data.Dataset):
    def __init__(self, images, labels, transform):
        self.images = images
        self.labels = labels
        self.transform = transform

    def __len__(self):
        return len(self.images)

    def __getitem__(self, idx):
        img, label = self.images[idx], self.labels[idx]
        img = self.transform(img)
        return img, label

def load_model(path : str = None):
    #load model
    model = models.resnet50(weights=None)
    model.fc = nn.Linear(model.fc.in_features, 2)
    model.load_state_dict(torch.load(path, map_location="cpu"))
    model.eval()
    return model

def prepare_image(image):
    preprocess = transforms.Compose([
        transforms.Grayscale(num_output_channels=1),  # ensure grayscale
        transforms.Resize((224, 224)),
        transforms.Lambda(lambda x: x.repeat(3, 1, 1)),  # convert to 3 channels
        transforms.Normalize(mean=[0.5, 0.5, 0.5], std=[0.5, 0.5, 0.5])
    ])

    # Convert to tensor
    img = transforms.functional.to_tensor(image)  # gives [C,H,W] with values [0,1]
    img = preprocess(img)
    img = img.unsqueeze(0)  # add batch dimension
    return img