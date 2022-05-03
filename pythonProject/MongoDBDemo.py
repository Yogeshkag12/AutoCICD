from pymongo import MongoClient
from bson.objectid import ObjectId

con = MongoClient("mongodb://localhost:27017/")
mydb = con.MyMongoDB
myCollection = mydb.Students


def create_user(name, surname, age):
    created_id = myCollection.insert_one({"name": name, "surname": surname, "Age": age})
    return created_id


def search_user(name):
    search_id = myCollection.find_one({"name": name})
    return search_id


def update_user(id, age):
    updated = myCollection.update_one({"_id": ObjectId(id)}, {"$set": {"Age": age}})
    return updated


def delete_user(id):
    deleted = myCollection.delete_one({"_id": ObjectId(id)})
    return deleted


# Call Create User
myCreate = create_user("Yogesh", "Kag", 20)
print(myCreate)

# Call Search User
mySearch = search_user("Harish")
print(mySearch)

# Call Update User
ageobj = {"age": 44}
myUpdate = update_user("6270e189549d571b233b9c07", 47)
print(myUpdate)
# Call Delete User
myDelete = delete_user("6270f34cf37d12370a93fa66")
print(myDelete)
