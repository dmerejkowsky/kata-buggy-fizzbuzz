import { add } from './calculator'
import { describe, expect, test } from '@jest/globals'


describe('Calculator', () => {
  test('2 plus 3 equals 5', () => {
    const left = 2
    const right = 3

    const result = add(left, right)

    expect(result).toBe(5)
  })
})
