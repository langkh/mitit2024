'''
test1 = "MITIT"
test2 = "ABCABC"
test3 = "ABCC"
def isGoodWord(word):
'''
#numOfTests = 4
line1 = "4 7"
line2 = "1 2 3 4"


line1List = line1.split()
problems = line2.split()
numOfProblems = int(line1List[0])
timeAllowed = int(line1List[-1])
print(timeAllowed)
def calculateMaxScore():
  maxScores = []
  time = 0
  i=0
  score = 0
  while time < timeAllowed:
    time+=int(problems[i])
    if time < timeAllowed:
      score += 1+int(problems[i])
      print(maxScore)
      i= i+1
    else:
      break
    
  return maxScore
print(calculateMaxScore())
