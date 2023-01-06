## two strings are known as isomorphic if they are characters are mapped properly between them

#eg: foo - boo => true
# foo - bar -> False

def isIsomorphic(str1, str2):
  
  h = dict()
  h1 = dict()
  
  if len(str1) != len(str2):
    return False
  
  for i in range(len(str1)):
    if str1[i] not in h:
      h[str1[i]] = t[i]
      
  for i in range(len(str1)):
    if str2[i] not in h1:
      h1[str2[i]] = s[i]
      
      
 for i range(len(str1)):
  if str2[i] != h[str1[i]]:
    return False
  
  if str1[i] != h1[str2[i]]:
    return Fasle
  
  return True
