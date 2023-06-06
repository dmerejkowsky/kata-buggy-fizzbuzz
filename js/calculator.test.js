const add = require('./calculator').add

describe('Calculator', () => {
  test('2 plus 3 equals 5', () => {
    const left = 2
    const right = 3

    const result = add(left, right)

    expect(result).toBe(5)
  })
})
