package tdd

import spock.lang.Specification

/**
 * Created by JamesKnowling on 24/01/2016.
 */
class groovy extends Specification {

  def "one should always say hello"() {
    expect:
    TestingSpock.returnSomething() == "Hello"
  }
}
