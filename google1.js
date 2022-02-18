//Question : A collection of numbers; take this collection of numbers and find a matching pair that is equal to the sum(8)
//In short, compare a pair of numbers inside the array and return whether there is any pair that sums up to 8
[1,2,3,9] Sum = 8
[1,2,4,4] Sum = 8


// Naive approach (Brute force)
function hasPairWithSum(arr , sum){
   var len = arr.length;
   for(var i =0; i<len-1; i++){
      for(var j = i+1; j<len; j++){
         if(arr[i] + arr[j] === sum)
            return true;
      }
   }
   return false;
}


// Better approach
function hasPairWithSum2(arr, sum){
   const mySet = new Set();
   const len = arr.length;
   for (let i = 0; i < len; i++){
      if(mySet.has(arr[i])) {
         return true;
      }
      mySet.add(sum - arr[i]);
   }
   return false;
}

hasPairWithSum2([6,4,3,2,1,7],9)
