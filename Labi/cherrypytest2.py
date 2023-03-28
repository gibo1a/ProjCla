import cherrypy

class Node(object):
    @cherrypy.expose
    def index(self):
        return "Eu sou o índice do Node (Node.index)"
    
    @cherrypy.expose
    def page(self):
        return "Eu sou um método do Node (Node.page)"

class HTMLDocument(object):
    @cherrypy.expose
    def readFile(self):
        return "ola"

class Root(object):
    def __init__(self):
        self.node = Node()
        self.html = HTMLDocument()
    
    @cherrypy.expose
    def form(self):
        cherrypy.response.headers["Content-Type"] = "text/html"
        return open("formulario.html")

    @cherrypy.expose
    def index(self):
        return "Eu sou o índice do Root (Root.index)"

    @cherrypy.expose
    def page(self):
        return "Eu sou um método do Root (Root.page)"
if __name__ == "__main__":
    cherrypy.quickstart(Root(), "/")