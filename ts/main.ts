import fizzBuzz from "./fizzbuzz"

const main = () => {
  for (let i = 1; i < 100; i++) {
    console.log(i, fizzBuzz(i))
  }
}

main()