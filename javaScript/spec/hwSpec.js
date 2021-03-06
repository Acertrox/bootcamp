//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n){
    var sum=0;
    for (let i = 1; i <= n; i++) {
        sum+=i;
    }
    return sum;
}
//devuelve la suma del primer y último número en el array
function sumFirstLast(arr){
    return arr[0] + arr[arr.length-1]
}

function sumMaxMin(arr) {
    max = arr[0];
    min = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (max<arr[i]) {
            max = arr[i];
        }
        if (min>arr[i]) {
            min = arr[i];
        }
    }
    return max + min;
}
    
describe("Sum1toN", function() { 
    it("should return 3 when we pass 2 as an argument", function() { 
        expect(Sum1toN(2)).toEqual(3); 
    }); 
    it("should return 6 when we pass 3 as an argument", function() { 
        expect(Sum1toN(3)).toEqual(6); 
    }); 
    it("should return 10 when we pass 4 as an argument", function() { 
        expect(Sum1toN(4)).toEqual(10); 
    }); 
    it("should return 15 when we pass 5 as an argument", function() { 
        expect(Sum1toN(5)).toEqual(15); 
    }); 
    it("should return 21 when we pass 6 as an argument", function() { 
        expect(Sum1toN(6)).toEqual(21); 
    }); 
});
    
describe("sumFirstLast", function() { 
    it("should return 3 when we pass [1,2] as an argument", function() { 
        expect(sumFirstLast([1,2])).toEqual(3); 
    }); 
    it("should return 10 when we pass [2,3,8] as an argument", function() { 
        expect(sumFirstLast([2,3,8])).toEqual(10); 
    }); 
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() { 
        expect(sumFirstLast([-6,23,3,-4])).toEqual(-10); 
    }); 
    it("should return -14 when we pass [-6,23,3,-4,3,1,6,-8] as an argument", function() { 
        expect(sumFirstLast([-6,23,3,-4,3,1,6,-8])).toEqual(-14); 
    }); 
});

describe("sumMaxMin", function() {
    it("should return 11 when we pass [1,3,10] as an argument", function() {
        expect(sumMaxMin([1,3,10])).toEqual(11);
    });
    it("should return -12 when we pass [-2,-5,-10] as an argument", function() {
        expect(sumMaxMin([-2,-5,-10])).toEqual(-12);
    });
    it("should return -5 when we pass [2, 5,-2,-5,-10] as an argument", function() {
        expect(sumMaxMin([2, 5,-2,-5,-10])).toEqual(-5);
    });
});