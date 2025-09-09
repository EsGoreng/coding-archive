import { test, describe } from 'node:test';
import { strict as assert } from 'node:assert';
import sum from './index.js';

describe('Pengujian fungsi sum', () => {
  
  test('seharusnya mengembalikan hasil penjumlahan yang benar jika kedua argumen adalah angka positif', () => {
    assert.strictEqual(sum(3, 4), 7, 'Test Case 1 Gagal: 3 + 4 seharusnya 7');
    assert.strictEqual(sum(10, 20), 30, 'Test Case 2 Gagal: 10 + 20 seharusnya 30');
  });

  
  test('seharusnya mengembalikan 0 jika salah satu atau kedua argumen bukan angka', () => {
    assert.strictEqual(sum('3', 4), 0, 'Test Case 3 Gagal: Argumen pertama string');
    assert.strictEqual(sum(3, '4'), 0, 'Test Case 4 Gagal: Argumen kedua string');
    assert.strictEqual(sum('3', '4'), 0, 'Test Case 5 Gagal: Kedua argumen string');
    assert.strictEqual(sum(null, 5), 0, 'Test Case 6 Gagal: Argumen pertama null');
    assert.strictEqual(sum(undefined, 5), 0, 'Test Case 7 Gagal: Argumen pertama undefined');
    assert.strictEqual(sum(true, 5), 0, 'Test Case 8 Gagal: Argumen pertama boolean');
  });

  
  test('seharusnya mengembalikan 0 jika salah satu atau kedua argumen adalah angka negatif', () => {
    assert.strictEqual(sum(-3, 4), 0, 'Test Case 9 Gagal: Argumen pertama negatif');
    assert.strictEqual(sum(3, -4), 0, 'Test Case 10 Gagal: Argumen kedua negatif');
    assert.strictEqual(sum(-3, -4), 0, 'Test Case 11 Gagal: Kedua argumen negatif');
  });

  
  test('seharusnya berfungsi dengan benar jika argumennya adalah 0', () => {
    assert.strictEqual(sum(0, 5), 5, 'Test Case 12 Gagal: 0 + 5 seharusnya 5');
    assert.strictEqual(sum(5, 0), 5, 'Test Case 13 Gagal: 5 + 0 seharusnya 5');
    assert.strictEqual(sum(0, 0), 0, 'Test Case 14 Gagal: 0 + 0 seharusnya 0');
  });
});