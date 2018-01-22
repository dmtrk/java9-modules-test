/e/apps/jdk-9.0.4/bin/jlink --module-path ./build/libs/:/e/apps/jdk-9.0.4/jmods --output jlinkOut --add-modules java_nine.test \
	--launcher run.sh=java_nine.test/java_nine.test.Main