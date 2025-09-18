import streamlit as st
import torch
from utils import load_model
from PIL import Image
from utils import prepare_image

#create file uploader in streamlit
uploaded_file = st.file_uploader("Choose a file")
if uploaded_file is not None:
    image = Image.open(uploaded_file).convert("L")
    st.image(image, caption="Uploaded Image",width="stretch")

    model = load_model("C:/Users/gabib/Desktop/Challenge/model/resnet50_breastmnist.pth")

    input_tensor = prepare_image(image)

    with torch.no_grad():
        outputs = model(input_tensor)
        probs = torch.softmax(outputs, dim=1)
        pred_class = torch.argmax(probs, dim=1).item()

    result = "Benign" if pred_class == 0 else "Malign"

    st.subheader(f"Predicted Class: {result}")