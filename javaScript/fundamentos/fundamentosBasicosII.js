function bigValue(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]>0) {
            arr[i]="Big"
        }
    }
    return arr
}
console.log(bigValue([-1,3,5,-5]))


function pMinRMax(arr) {
    var min = arr[0]
    var max = arr[0]
    for (let i = 0; i < arr.length; i++) {
        if (max<arr[i]) {
            max=arr[i]
        }
        if (min>arr[i]) {
            min=arr[i]
        }
    }
    console.log(min)
    return max
}
console.log(pMinRMax([4,67,1,7,2,71220,24,46367,234]))



function printReturnOdd(arr) {
    console.log(arr[arr.length-2])
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]%2==1) {
            return arr[i]
        }
    }
    return false;
}
console.log(printReturnOdd([4,67,1,7,2,71220,24,46367,234]))


function dobleVision(arr){
    var arr2=[];
    for (var i = 0; i < arr.length; i++) {
        arr2.push(arr[i]*2)
    }
    return arr2
}
arr1 = [1,2,3]
console.log(dobleVision(arr1))
console.log(arr1)



function countPos(arr){
    var sum=0
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]>0) {
            sum+=1
        }
    }
    arr[arr.length-1]=sum;
    return arr;
}
console.log(countPos([-1,1,1,1]))



function evenOdds(arr) {
    var even =0
    var odd = 0
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
            even+=1
            odd = 0
        }
        else{
            odd+=1
            even=0
        }
        if (odd==3) {
            console.log("¡Qué imparcial!")
            odd=0
        }
        if (even==3) {
            console.log("¡Es para bien!")
            even=0
        }
    }
}
evenOdds([4,67,1,7,2,71220,24,46367,234])


function oddIndex(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (i%2==1) {
            arr[i]+=1
        }
    }
    for (let i=0;i<arr.length; i++){
        console.log(arr[i]);
    }
    return arr
}
console.log(oddIndex([4,67,1,7,2,71220,24,46367,234]))



function prevLen(arr) {
    for (let i = arr.length-1; i > 0; i--) {
        arr[i]=arr[i-1].length
    }
    return arr;
}
console.log(prevLen(["programar","dojo", "genial"]))



function agregaSiete(arr){
    var arr2=[];
    for (var i = 0; i < arr.length; i++) {
        arr2.push(arr[i]+7)
    }
    return arr2
}
arr1 = [1,2,3]
console.log(agregaSiete(arr1))
console.log(arr1)


function invertArr(arr) {
    for (let i = 0; i < arr.length/2; i++) {
        var temp=arr[i]
        arr[i]=arr[arr.length-1-i]
        arr[arr.length-1-i]=temp
    }
    return arr
}
console.log(invertArr([2,4,6,1,3]));


function onlyNeg(arr) {
    var arr2=[]
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]>0) {
            arr2.push(arr[i]*-1)
        }
        else{
            arr2.push(arr[i])
        }
    }
    return arr2
}
arr=[1,-3,5]
console.log(onlyNeg(arr))
console.log(arr)



function alwaysHungry(arr) {
    var hungry = true
    for (let i = 0; i < arr.length; i++) {
        if (arr[i]=="comida") {
            console.log("yummy")
            hungry = false
        }
    }
    if (hungry) {
        console.log("tengo hambre")
    }
}
alwaysHungry(["comida", 2, 3, 4]);
alwaysHungry(["comida", 2, 3, "comida"]);
alwaysHungry([1, 2, 3, 4]);


function swapEvenIndex(arr){
    arr2=arr
    for(var i=0; i<arr2.length/2;i++){
        if(i%2==0){
            temp=arr2[i]
            arr2[i]=arr[arr2.length-1-i];
            arr2[arr2.length-1-i]=temp;
        }
    }
    return arr2
}
console.log(swapEvenIndex([true, 42, "Ada", 2, "pizza"]))
console.log(swapEvenIndex([1,2,3,4,5,6]))


function multArray(arr, num) {
    for (let i = 0; i < arr.length; i++) {
        arr[i]*=num
    }
    return arr;
}
console.log(multArray([1,2,3], 3))