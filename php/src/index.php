<?php
require('src/FizzBuzz.php');

foreach (range(1, 100) as $number) {
    $res = fizzBuzz($number);
    echo "{$number} {$res}\n";
}
?>
