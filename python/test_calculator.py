from calculator import add


def test_two_plus_three_is_five():
    left = 2
    right = 3

    result = add(left, right)

    assert result == 5
