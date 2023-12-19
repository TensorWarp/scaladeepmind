package com.tensorwarp

class Dim(val dimensions: Int, val x: Int, val y: Int, val z: Int, val examples: Int, val stride: Int) {
  def this(dimensions: Int, x: Int, y: Int, z: Int, examples: Int) = {
    this(dimensions, x, y, z, examples, x * y * z)
  }

  def this(dim: Dim, examples: Int) = {
    this(dim.dimensions, dim.x, dim.y, dim.z, examples)
  }
}

object Dim {
  def _1d(x: Int, examples: Int): Dim = new Dim(1, x, 1, 1, examples, x * 1 * 1)
  def _2d(x: Int, y: Int, examples: Int): Dim = new Dim(2, x, y, 1, examples, x * y * 1)
  def _3d(x: Int, y: Int, z: Int, examples: Int): Dim = new Dim(3, x, y, z, examples, x * y * z)
}