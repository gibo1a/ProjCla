import os.path
import cherrypy
# The absolute path to this file’s base directory
baseDir = os.path.dirname(os.path.abspath(__file__))
# Dictionary with this application’s static directories configuration
config = {
    "/": { "tools.staticdir.root": baseDir },
    "/html": { "tools.staticdir.on": True, "tools.staticdir.dir": "html" },
    "/js": { "tools.staticdir.on": True, "tools.staticdir.dir": "js" },
    "/css": { "tools.staticdir.on": True, "tools.staticdir.dir": "css" },
    "/images": { "tools.staticdir.on": True, "tools.staticdir.dir": "images" },
}
class Root:
    @cherrypy.expose
    def index(self):
        return open("html/index.html")

cherrypy.quickstart(Root(), "/", config)