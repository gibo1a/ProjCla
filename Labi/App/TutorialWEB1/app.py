import os.path
import cherrypy
import time
from math import radians, cos, sin, asin, sqrt
import json

def distance(lat, lon):
	lat1 = 38.752667
	lon1 = -9.184711
	lon, lat, lon1, lat1 = map(radians, [lon, lat, lon1, lat1]) # Degrees -> Radians
	dlon = lon - lon1
	dlat = lat - lat1
	a = sin(dlat/2)**2 + cos(lat1) * cos(lat) * sin(dlon/2)**2 # Haversine formula
	c = 2 * asin(sqrt(a))
	km = 6367 * c # Earth Ray = 6367 km
	cherrypy.response.headers["Content-Type"] = "application/json"
	return json.dumps({"distance": km}).encode("utf-8")

# The absolute path to this file's base directory
baseDir = os.path.abspath(os.path.dirname(__file__))

# Dictionary with this application's static directories configuration
config = {
			"/":		{	"tools.staticdir.root": baseDir },

			"/html":	{	"tools.staticdir.on": True, "tools.staticdir.dir": "html" },

			"/js":		{	"tools.staticdir.on": True, "tools.staticdir.dir": "js" },

			"/css":		{	"tools.staticdir.on": True, "tools.staticdir.dir": "css" },

			"/images":	{	"tools.staticdir.on": True, "tools.staticdir.dir": "images" },

			"/uploads":	{	"tools.staticdir.on": True, "tools.staticdir.dir": "uploads" } ,       
}

class Root(object):
	@cherrypy.expose
	def index(self):
		return open("/home/gabriel/Desktop/ProjCla/Labi/App/TutorialWEB1/html/index.html")
	
	@cherrypy.expose
	def clock(self):
		cherrypy.response.headers["Content-Type"] = "application/json"
		return time.strftime({"date":"%d-%m-%Y", "time":"%H:%M:%S"}).encode("utf-8")
	
	# Distance
	@cherrypy.expose
	def distance(self, lat, lon):
		return distance(float(lat), float(lon))
	
	@cherrypy.expose
	def upload(self, myFile):
		fileout = open("uploads/" + myFile.filename, "wb")
		while True:
			data = myFile.file.read(8192)
			if not data: break
			fileout.write(data)
		fileout.close()

cherrypy.quickstart(Root(), "/", config)
