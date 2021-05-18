function mayorQue(y, Y) {
    var sum=0;
    for(var i=0; i<y.length;i++){
        if(y[i]>Y){
            sum+=1;
        }
    }
    return sum;
}

console.log([2,6,3,4,6,1],3) //imprime 3 ya que los dos "6" y el "4" son mayores que 3

function maxMinAvg(arr) {
    max = arr[0];
    min = arr[0];
    sum = 0;
    for(var i=0; i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i]
        }
        if(arr[i]<min){
            min = arr[i]
        }
        sum+=arr[i]
    }
    console.log("el mayor del arreglo es "+max)
    console.log("el menor del arreglo es "+min)
    console.log("el promedio del arreglo es "+sum/arr.length)
}

maxMinAvg([1,2,5,4,3]) //imprime el numero 5 como mayor, 1 como menor y 3 como promedio


function replaceNeg(arr){
    arr2 = arr
    for(var i=0; i<arr2.length; i++){
        if(arr2[i]<0){
            arr2[i]="Dojo";
        }
    }
    return arr2
}

console.log( replaceNeg([1,2,-3,-5,5])) //imprime [1,2,"Dojo","Dojo",5]



function removerRango(arr, inicio, fin){
    arr2 = [];
    for(var i=0; i<arr.length; i++){
        if(i<inicio){
            
            arr2.push(arr[i])
        }
        else if(i>fin){
            arr2.push(arr[i])
        }
    }
    return arr2
}
console.log(removerRango([20,30,40,50,60,70],2,4)) //imprime [20, 30, 70]

