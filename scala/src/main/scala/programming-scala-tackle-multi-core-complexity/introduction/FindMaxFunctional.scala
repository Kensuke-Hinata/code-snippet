object FindMaxFunctional {
  def findMax(arr : List[Int]) = {
    arr.foldLeft(Integer.MIN_VALUE) { Math.max }
  }
}
