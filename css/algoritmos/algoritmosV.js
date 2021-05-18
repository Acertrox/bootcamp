function resetNegativos(arr){
    arr2 = arr
    for(var i=0;i<arr2.length;i++){
        
        if(arr2[i]<0){
            arr2[i]=0
        }
    }
    return arr2
}
console.log(resetNegativos([1,2,-1,-3]));

function moverAdelante(arr){
    arr2 = arr;
    arr2.shift();
    arr2.push(0);
    return arr2
}

console.log(moverAdelante([1,2,3]));

function returnReverso(arr){
    arr2 = [];
    for(var i = arr.length-1; i>=0; i--){
        arr2.push(arr[i]);
    }
    return arr2
}
console.log(returnReverso([1,2,3]));


function repetirValores(arr){
    arr2 = []
    for(var i=0; i<arr.length; i++){
        arr2.push(arr[i])
        arr2.push(arr[i])
    }
    return arr2;
}

console.log(repetirValores([4,"Ulysses", 42, false]))