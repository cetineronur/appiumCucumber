Feature:ApiDemos Wifi Test

  @switch
  Scenario: Goster Gununu
    Given Prefenceye tikla
    And kullanici Switchi tiklar
    And kullanici ilk Switch butonunu acar
    Then kullanici ilk Switch butonunun acik oldugunu onaylar
