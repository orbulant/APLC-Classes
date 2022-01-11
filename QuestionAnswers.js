const array = [12, 34, 21, 4, 56, 77, 88, 44, 885, 2, 5, 7, 98, 54];

/**
 * Question 1
 */
console.log("Question 1");
array.forEach((item) => console.log(item));

/**
 * Question 2
 */
console.log("Question 2");
console.log(
  array.filter((item) => {
    return item == 885 ? item : null;
  })
);

/**
 * Question 3
 */

console.log("Question 3");
const doubledUpArray = array.map((item) => item * 2);
console.log(doubledUpArray);

/**
 * Question 4
 */
console.log("Question 4");
console.log([...array].sort((a, b) => a - b));

// Question 5
console.log("Question 5");
console.log([...array].sort((a, b) => b - a));

// Question 6
console.log("Question 6");
const generateNumbersBy2 = (lowerBound, upperBound) => {
  let array = [];
  for (let i = lowerBound; i <= upperBound; i += 2) {
    array.push(i);
  }
  return array;
};
const newArray = generateNumbersBy2(2, 20).concat(array);
console.log(newArray);
