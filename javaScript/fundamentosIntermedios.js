function sigma(num){
    var sum=0
    for (let i = 1; i <= num; i++) {
        sum+=i
    }
    return sum
}
console.log(sigma(3))



function factorial(num){
    var sum=1
    for (let i = 2; i <= num; i++) {
        sum*=i
    }
    return sum
}
console.log(factorial(3))


function fibWoRec(num){
    if (num==0) {
        return 0
    }
    if (num==1) {
        return 1
    }
    var fib1=0
    var fib2=1
    var res=0
    for (let i = 2; i <= num; i++) {
        res=fib1+fib2
        if (fib1<=fib2) {
            fib1 = res
        }
        else{
            fib2 = res
        }
    }
    return res;
}
console.log(fibWoRec(0));


function devPenult(arr) {
    if (arr.length<2) {
        return null
    }
    else{
        return arr[arr.length-2]
    }
}
console.log(devPenult([42,true,4,"Liam", 7]))



function devNum(arr, num) {
    if (arr.length<=num) {
        return null
    }
    else{
        return arr[arr.length-1-num]
    }
}
console.log(devNum([5,2,3,5,1,5],6))



function sndMax(arr) {
    if (arr.length<2) {
        return null
    }
    if (arr[0]>arr[1]) {
        max = arr[0]
        sndmax = arr[1]
    }
    else{
        max = arr[1]
        sndmax = arr[0]
    }
    for (let i = 2; i < arr.length; i++) {
        if (arr[i]>max) {
            sndmax = max
            max = arr[i]
        }
        else if(arr[i]>sndmax){
            sndmax = arr[i]
        }
    }
    return sndmax;
}
console.log(sndMax([4,67,1,7,2,71220,24,46367,234]))


function doubleEvenProblem(arr) {
    arr2=[]
    for (let i = 0; i < arr.length; i++) {
        if (i%2==0) {
            arr2.push(arr[i])
        }
        arr2.push(arr[i])
    }
    arr = arr2
    return arr;
}
console.log(doubleEvenProblem([4, "Ulysses", 42, false]))


function fib(n) {
    if (n==0) {
        return 0
    }
    else if(n==1){
        return 1
    }
    else {
        return fib(n-2)+fib(n-1);
    }
}
console.log(fib(0))
console.log(fib(1))
console.log(fib(2))
console.log(fib(3))
console.log(fib(4))
console.log(fib(5))
console.log(fib(6))
console.log(fib(7))
