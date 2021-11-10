import wikipedia
import json

def scraper():
    data = wikipedia.summary('Poker', sentences= 6)
    return(data)

p = scraper()
print(p)