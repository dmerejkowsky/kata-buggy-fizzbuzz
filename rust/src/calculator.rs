pub fn add(left: usize, right: usize) -> usize {
    left + right
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn two_plus_three_is_fize() {
        let left = 2;
        let right = 3;

        let result = add(left, right);

        assert_eq!(result, 5);
    }
}
