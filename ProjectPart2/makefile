# NOTE: Make sure you change the JFX_INCL to the where your javafx packages are located
out_dir := bin/
src_dir := src/
dist := P1-code.zip
FLAGS := --release 11 -d $(out_dir) -sourcepath $(src_dir)

# openjfx configurations
JFX_INCL := "/mnt/c/MrPineapple/Texas A&M/Records/javafx-sdk-19/lib"
JAVAFXC := javac --release 11 --module-path $(JFX_INCL) --add-modules javafx.graphics,javafx.fxml
JAVAFX := java --module-path $(JFX_INCL) --add-modules javafx.graphics,javafx.fxml

vending:
	javac $(FLAGS) src/vending/Driver.java
	java -cp $(out_dir) vending.Driver
	
vending-gui:
	$(JAVAFXC) -d $(out_dir) -sourcepath $(src_dir) src/application/Main.java
	$(JAVAFX) -cp $(out_dir) application.Main

clean:
	rm -rf $(out_dir) $(dist)
    