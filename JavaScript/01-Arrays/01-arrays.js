const strings = ["a", "b", "c", "d"];
const numbers = [1, 2, 3, 4, 5];
// Variable array is somewhere in memory and the computer knows it.
// When I do array[2], i'm telling the computer, hey go to the array and grab the 3rd item from where the array is stored.

//push
strings.push("e"); //o(n)
//['a', 'b', 'c', 'd','e']
//pop
strings.pop(); //o(1)
strings.pop();
//['a', 'b', 'c']

//unshift
strings.unshift("x"); //o(n)
//['x','a', 'b', 'c']
//splice
strings.splice(2, 0, "alien"); //o(n)
//['x','a','alien', 'b', 'c']
// index 2: add alien then delete the next 0 elements
