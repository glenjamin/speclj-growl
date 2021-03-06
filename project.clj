(defproject speclj-growl "2.1.0"
  :description "Growl reporter for the speclj testing framework"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [gntp "0.6.0"]]
  :resource-paths ["resources"]
  :profiles {
    :dev {
      :plugins [[speclj "2.7.2"]]
      :dependencies [[speclj "2.7.2"]]
      :test-paths ["spec/"]}})
