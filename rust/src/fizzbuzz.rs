pub fn fizzbuzz(number: usize) -> String {
    if number % 3 == 0 {
        "fizz".to_string()
    } else if number % 5 == 0 {
        "buzz".to_string()
    } else if number % 15 == 0 {
        "fizzbuzz".to_string()
    } else {
        number.to_string()
    }
}

#[test]
fn test_fizzbuzz() {
    // TODO
}
