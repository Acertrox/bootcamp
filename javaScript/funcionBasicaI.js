
//predicciones correctas: 15/15

function a(){
    return 35;
}
console.log(a())

//prediccion 35
//salida 35

function a(){
    return 4;
}
console.log(a()+a());

//prediccion 8
//salida 8

function a(b){
    return b;
}
console.log(a(2)+a(4));

//prediccion 6
//salida 6

function a(b){
    console.log(b);
    return b*3;
}
console.log(a(3));

//prediccion 3, 9
//salida 3, 9

function a(b){
    return b*4;
    console.log(b);
 }
 console.log(a(10));

//prediccion 40
//salida 40

function a(b){
    if(b<10) {
        return 2;
    }
    else     {
        return 4;
    }
    console.log(b);
}
console.log(a(15));

//prediccion 4
//salida 4

function a(b,c){
    return b*c;
}
console.log(10,3);
console.log( a(3,10) );

//prediccion 10, 3, 30
//salida 10, 3, 30

function a(b){
    for(var i=0; i<10; i++){
        console.log(i);
    }
    return i;
}
console.log(3);
console.log(4);

//prediccion 3, 4
//salida 3, 4

function a(){
    for(var i=0; i<10; i++){
        i = i +2;
        console.log(i);
    }
}
a();

//prediccion 2, 5, 8, 11
//salida 2, 5, 8, 11

function a(b,c){
    for(var i=b; i<c; i++) {
       console.log(i);
   }
   return b*c;
}
a(0,10);
console.log(a(0,10));

//prediccion 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
//salida 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0

function a(){
    for(var i=0; i<10; i++){
       for(var j=0; j<10; j++){
           console.log(j);
       }
       console.log(i);
    }
}

//prediccion (no se llama a la funcion por lo que no hace nada)
//salida (no se llama a la funcion por lo que no hace nada)

function a(){
    for(var i=0; i<10; i++){
        for(var j=0; j<10; j++){
            console.log(i,j);
        }
        console.log(j,i);
    }
}

//prediccion (no se llama a la funcion por lo que no hace nada)
//salida (no se llama a la funcion por lo que no hace nada)

var z = 10;
function a(){
    var z = 15;
    console.log(z);
}
console.log(z);

//prediccion 10
//salida 10

var z = 10;
function a(){
    var z = 15;
    console.log(z);
}
a();
console.log(z);

//prediccion 15 10
//salida 15 10

var z = 10;
function a(){
    var z = 15;
    console.log(z);
    return z;
}
z = a();
console.log(z);

//prediccion 15 15
//salida 15 15