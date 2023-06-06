const fizzBuzz = (number) => {
  if (number % 5 === 0) {
    return "fizz"
  }
  if (number % 3 === 0) {
    return "buzz"
  }
  if (number % 15 === 0) {
    return "fizzbuzz"
  }
  return number.toString()
}



module.exports = fizzBuzz
