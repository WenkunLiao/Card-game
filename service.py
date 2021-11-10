import wikipedia
import json

def scraper(target):
    data = wikipedia.summary(target)
    dic = {"data" : data}
    output = json.dumps(dic)
    return(output)