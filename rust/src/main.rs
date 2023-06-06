use buggy_fizzbuzz::fizzbuzz;

fn main() {
    for i in 1..=100 {
        println!("{i} {}", fizzbuzz(i));
    }
}
