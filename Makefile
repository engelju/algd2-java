helloworld:
	javac -d bin -sourcepath src src/cc/engelju/Main.java

run:
	java -cp bin cc.engelju.Main

clean:
	rm -rf bin

edit:
	mvim src/cc/engelju/
