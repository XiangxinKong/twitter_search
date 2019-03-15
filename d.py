import json

#把地址改成文件所在地
f=open("C:\\Users\Administrator\Downloads\\twitter-2018-09-01\\2018\\09\\01\\00\\30.json",'r')
r=f.readlines()
f.close()

#每个推特存进
j=[]
for i in range(len(r)):
   j.append(json.loads(r[i]))

#print分类
print("总目录")
for i in j[3]:
    print(i,end="   ")
print("\n\n")

#print user信息分类
print("用户信息目录")
for i in j[3]["user"]:
    print(i,end="   ")
print("\n\n")

#print单条信息
print(j[53])

#print hashtag
for i in range(len(j)):
    if j[i].__contains__('entities'):
        if j[i]['entities']['hashtags']:
            print(j[i]['entities']['hashtags'])
            print()

#推特用户地址
for i in range(len(j)):
    if j[i].__contains__('user') and j[i]['user'].__contains__('location'):
        print(j[i]['user']['location'])

