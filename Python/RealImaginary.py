import numpy as np
 
array = np.array([1.+2.j , 2.+3.j , 4.+5.j])
print(array)
 
print("The dimension of the array is : ",array.ndim)
 
print("Datatype of our Array is : ",array.dtype)
 
print("Shape of the array is : ",array.shape)
 
print("real part of the imaginary numbers in the array is :",np.real(array))
