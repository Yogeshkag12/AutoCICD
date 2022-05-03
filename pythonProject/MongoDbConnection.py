
from pymongo import MongoClient

conn = MongoClient("mongodb://localhost:27017/")
mydb = conn.yogidb
myCol = mydb.customers
myCol.insert_one({"name":"Yogesh"})


