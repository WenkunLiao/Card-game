import string
import codecs
import wikipedia
import csv
input_request=input('Search: ')
cut=string.capwords(input_request)
lists=cut.split()
rest='_'.join(lists)

def scrape(rest):
    data = wikipedia.summary(rest)
    f = open('service.txt', mode = 'w')
    f.write(data)
    f.close()
scrape(rest)
