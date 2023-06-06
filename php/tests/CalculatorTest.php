<?php declare(strict_types=1);
use PHPUnit\Framework\TestCase;
require('src/Calculator.php');

class CalculatorTest extends TestCase {
    public function test_two_plus_three_is_fize() {
      $left = 2;
      $right = 3;

      $result = Calculator::add($left, $right);

      $this->assertSame($result, 5);
    }
}
?>
