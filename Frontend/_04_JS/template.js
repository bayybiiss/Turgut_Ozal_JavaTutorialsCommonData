//alert("deneme")
//window.alert("deneme44")
// document.write("ana ekran")
// console.log("console")
// console.warn("console")
// console.error("console")
// console.info("console")

var deneme1 = 44;
var deneme1 = 55;

// let result=prompt("İsminizi Giriniz");
// console.log(result)
// "" '' ``

let valueName = true;
console.log(valueName)
console.log(typeof valueName)

//whoisting: var için kullanılır
deneme = 10 + 20
var deneme;
console.log(deneme)

//cast
//let data1=prompt("Sayı giriniz"); bu haliyle girilen sayıları string kabul eder
// let data1=Number(prompt("Sayı giriniz"));
// console.log(data1);
// console.log(typeof data1)

//NaN
console.log(4 / "asd")

//infinity
console.log(4 / 0)

//undefined
let data;
console.log(data)

//escape character
// \ ' \""

//String
let vocabulary = "Javascript öğreniyorum";
console.log(vocabulary)
console.log(vocabulary.toLowerCase())
console.log(vocabulary.toUpperCase())
console.log(vocabulary.length)
console.log(vocabulary.charAt(0))
console.log(vocabulary.indexOf("Javascript"))
console.log(vocabulary.lastIndexOf("Javascript"))
console.log(vocabulary.startsWith("J"))
console.log(vocabulary.endsWith("m"))
console.log(vocabulary.substring(1))
console.log(vocabulary.substring(1, 4)) //1<=x<=4-1

//Math
console.log(Math.min(1, 100, 200))
console.log(Math.max(1, 100, 200))
console.log(Math.sqrt(100))
console.log(Math.abs(-100))
console.log(Math.pow(2, 5))
console.log(Math.sin(45))
console.log(Math.floor(5.9))
console.log(Math.ceil(5.1))
console.log(Math.round(7.4))
console.log(Math.round(7.5))

//function
function returnsuzParametresiz() {
    console.log("Returnsuz parametresiz")
}
returnsuzParametresiz()
function returnsuzParametreli(data) {
    console.log("returnsuz parametreli " + data)
}
returnsuzParametreli("kelime")

function returnluParametresiz() {
    return "returnlu parametresiz"
}
// returnluParametresiz() sadece bununla çağıramayız
let data5 = returnluParametresiz()
console.log(data5)

function returnluParametreli(data) {
    return "returnlu parametreli " + data
}
let data4 = returnluParametreli("hello")
console.log(data4)

//normal function
function normal() {
    console.log("normal")
}
normal()

//anonymous function
let anonymous = function () {
    console.log("anonymous")
}
anonymous()

//arrow function
let arrow = () => {
    console.log("arrow")
}
arrow()

///////////////////////////////////////////

//contional
let contional = () => {
    let data = 5;
    if (data > 0) {
        console.log("pozitif sayı")
    } else
        console.log("negatif sayı ")
}
contional()


// =atama
// ==eşit mi
// === eşit mi ancak türüne bakılarak

let contional2 = () => {
    let data = 5;
    if (data == 1) {
        console.log("1")
    } else if (data === 2) {
        console.log("2 ")
    } else if (data === 3) {
        console.log("3")
    } else if (data === 4) {
        console.log("4")
    } else if (data === 5) {
        console.log("5")
    } else
        console.log("negatif sayı")
}
contional2()

//loop
let loop = () => {
    for (let index = 0; index < 10; index++) {
        //console.log(index+ " ")
        document.write(index + " ")
    }
}
loop()
document.writeln("<br/>")
let loop2 = () => {
    let i = 0;
    while (i < 10) {
        document.write(i + " ")
        i++
    }
}
loop2()
document.writeln("<br/>")
let loop3 = () => {
    let i = 0;
    do {
        document.write(i + " ")
        i++
    } while (i < 10);
}
loop3()

document.writeln("<br/>")

//Exception handling
let value = () => {
    try {
        alertx("data")
    } catch (error) {
        document.write("Err: " + error)
    } finally {
        document.write("<br/>db.close")
    }
}
value()

//Dizi
let arr = [44, "str", true];
console.log(typeof arr)
console.log(arr)

document.writeln("<br/>")
let dizi = () => {
    let temp;
    let sum = 0;
    let dizi = [];
    for (let i = 0; i < 5; i++) {
        temp = Math.round(Math.random() * 9 + 1);
        dizi[i] = temp;
        sum += dizi[i];
    }
    //console.log(dizi)
    dizi.forEach(function (value) {
        console.log(value)
    })
    console.log(" ")
    dizi.forEach((value) => {
        console.log(value)
    })
    console.log(sum)
}
dizi()

//filter
let filter = () => {
let dizi=[1,2,3,4,5,6,7,8];
let result = dizi.filter((temp)=>{
    return temp%2===0
})
result.forEach((temp)=>{
    document.writeln(temp)
})
}
filter()

//object
document.writeln("<br/>")
let object = ()=>{
    let obj={
        "name":"Beyza",
        "surname":"Açıkgöz",
        "language":12,
        "isLogin":true,
        "dizi":[1,2,3,4],
        "innerObj":{
            "name":"computer",         
        }
    };
    console.log(obj)
    console.log(obj.name.toUpperCase())
    console.log(obj.dizi[3])
}
object()