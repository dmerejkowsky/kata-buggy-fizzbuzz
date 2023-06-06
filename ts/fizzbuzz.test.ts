import fizzBuzz from './fizzbuzz'
import { describe, expect, test } from '@jest/globals'

describe('FizzBuzz', () => {
  test('it works', () => {
    expect(fizzBuzz).toBeDefined()
  })
})
