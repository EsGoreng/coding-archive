import test from 'node:test';
import assert from 'node:assert';
import { sum } from './index.js';

test('menjumlahkan dua bilangan positif', () => {
  assert.strictEqual(sum(2, 3), 5);
});

test('menjumlahkan bilangan negatif dan positif', () => {
  assert.strictEqual(sum(-2, 3), 1);
});

test('menjumlahkan dua bilangan negatif', () => {
  assert.strictEqual(sum(-4, -6), -10);
});

test('menjumlahkan nol dengan bilangan lain', () => {
  assert.strictEqual(sum(0, 7), 7);
});
