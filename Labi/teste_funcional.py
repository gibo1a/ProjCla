import pytest
import sys
from subprocess import Popen
from subprocess import PIPE

proc = Popen("ls -la ", stdout=PIPE, shell=True)
return_code = proc.wait()
output = proc.stdout.read().decode("utf-8")