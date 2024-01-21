
num1 = 121212
num2 = 11121
num3 = 12211
num4 = 212221112112211
'''

def main():
  rawInput = "4\n2222222"
  rawInputList = rawInput.splitlines()
  cases = rawInputList[0]
  rawInputList.pop(0)
  for num in rawInputList:
    print(num+" 2")
main()
'''
def main():
  rawInput = "4\n121212\n11121\n12211\n212221112112211"
  rawInputList = rawInput.splitlines()
  cases = rawInputList[0]
  rawInputList.pop(0)
  for num in rawInputList:
    print(num+" "+str(int(num)//2))


def checkComposite(num):
  if num % 2 == 0:
    return str(num) + " "+str(num//2)
  elif num %3 == 0:
    return str(num) +" "+ str(num//3)
  else:
    return makeComposite(num)
def makeComposite(num):
  strNum = str(num)
  numList = []
  for i in strNum:
    numList.append(i)
  index = 0
  while num%2 !=0 or num%3!= 0:
    numRemoved = numList[index]
    numList.pop(index)
    strNum = ""
    for i in numList:
      strNum += i

    if int(strNum)%2 == 0:
      return strNum + " " +str(int(strNum)//2)
    elif int(strNum)%3 == 0:
      return strNum + " "+ str(int(strNum)//3)
    else:
      numList.insert(index, numRemoved)
    index+=1
    
main()
