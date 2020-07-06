package animal {
  object UseFriend {
    def main(args : Array[String]) : Unit = {
      val john = new Man("John")
      val sara = new Woman("Sara")
      val comet = new Dog("Comet")

      john.listen
      sara.listen
      comet.listen

      val mansBestFriend : Friend = comet
      mansBestFriend.listen

      def helpAsFriend(friend : Friend) = friend listen

      helpAsFriend(sara)
      helpAsFriend(comet)
    }
  }
}
