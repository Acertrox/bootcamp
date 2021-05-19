function arrWith255() {
    var arr=[]
    for(var i=1; i<=255; i++){
        arr.push(i)
    }
    return arr;
}
console.log(arrWith255())


function sumEven1000() {
    var sum=0
    for (let i = 1; i <= 1000; i++) {
        if(i%2==0){
            sum += i
        }
    }
    return sum;
}
console.log(sumEven1000())


function sumOdd5000() {
    var sum=0
    for (let i = 1; i <= 5000; i++) {
        if(i%2==1){
            sum += i
        }
    }
    return sum;
}
console.log(sumOdd5000())


function sumArray(arr) {
    var sum=0
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum
}
console.log(sumArray([1,2,5]))
console.log(sumArray([-5,2,5,12]))

function maxInArray(arr) {
    var max=arr[0]
    for (let i = 1; i < arr.length; i++) {
        if (arr[i]>max) {
            max = arr[i]
        }
    }
    return max;
}
console.log(maxInArray([4,67,1,7,2,71220,24,46367,234]))

function avgArray(arr) {
    var sum=0
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum/arr.length
}
console.log(avgArray([1,2,5]))
console.log(avgArray([-5,2,5,12]))


function arrWithOdd50() {
    var arr = []
    for (let i = 1; i <= 50; i++) {
        if (i%2==1) {
            arr.push(i)
        }
    }
    return arr;
}
console.log(arrWithOdd50())


function mayorQueArray(arr, Y) {
    var sum= 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]>Y) {
            sum+=1
        }        
    }
    return sum;
}
console.log(mayorQueArray([1,3,5,7],3))


function squareArray(arr) {
    arr2 = arr
    for (let i = 0; i < arr2.length; i++) {
        arr2[i]*=arr2[i]
    }
    return arr2
}
console.log(squareArray([1,5,10,-2]))


function noNeg(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]<0) {
            arr[i]=0
        }
    }
    return arr
}
console.log(noNeg([1,5,10,-2]))


function maxMinAvg(arr) {
    arr2=[]
    max=arr[0]
    min=arr[0]
    sum=0
    for (let i = 0; i < arr.length; i++) {
        if (max<arr[i]) {
            max = arr[i]
        }
        if (min>arr[i]) {
            min = arr[i]
        }
        sum +=arr[i]
    }
    arr2.push(max)
    arr2.push(min)
    arr2.push(sum/arr.length)
    return arr2
}
console.log(maxMinAvg([1,5,10,-2]))


function swapValues(arr) {
    var temp = arr[0]
    arr[0] = arr[arr.length-1]
    arr[arr.length-1] = temp;
    return arr;
}
console.log(swapValues([1,5,10,-2]))

function negToString(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]<0) {
            arr[i]="Dojo"
        }
    }
    return arr
}
console.log(negToString([-1,-3,2]))