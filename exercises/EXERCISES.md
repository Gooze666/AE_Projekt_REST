# Übungen

## Voraussetzungen / Hinweise
Die Übungen wurden auf Linux/Unix-Systemen getestet. Es sind eventuell Anpassungen für Windows-Umgebungen
vorzunhemen.


## Übung: Starte den Service
   1. Öffnen Sie das Verzeichnis 'sripts' im Projektordner prüfen Sie das Bash-Skript itechDropConf.sh (Wie wird die JAR gestartet?
Welchen Inhalt hat die Datei, die hinter dem Parameter 'server' verweist der Parameter 'server'?).
   2. Erzeugen Sie eine Jar-Datei von dem Service, z. B. mit dem Maven Befehl 'mvn clean install'. Dieser erzeugt im
target-Verzeichnis eine Jar-Datei (dropwizard-example-1.0-SNAPSHOT.jar)
   3. Starten Sie den Service in dem Sie das Skript ausführen oder die Jar-Datei, so wie im Skript aufgeführt, starten.
   4. Beim Hochfahren des Services wird in der Konsole u. a. die zur Verfügung stehenden Resourcen angezeigt, z. B.
'GET /client/helloWorldText'. Welche Resourcen stellt der Service außerdem zur Verfügung?
   5. Rufen Sie die Resource 'helloWorldText' auf: 'http://localhost:18181/helloWorld/simpleText'. Sie sollten als Ergebnis
'Hallo Welt!' sehen :-)!

## Übung: Untersuchen Sie die Resourcen und die Header der HTTP-Antworten
1. Ermöglichen Sie, dass Sie lokal die HTTP-Header auslesen können. Dafür können Sie z. B. CURL nutzen
und die Anfragen mit dem Parameter -v (verbose) nutzen. Alternativ können Sie auch die Entwickler-Tools
Ihres Browsers nutzen.
2. Prüfen Sie den Inhalt der Ressource: itech/resources/HelloWorldResource.java .
Den Pfad http://localhost:18181/helloWorld/simpleText haben Sie bereits aufgerufen. Rufen Sie jetzt die anderen vier
Pfade der Ressource auf. Hinweis: Parameter können Sie u. a. mit <URL-Ressource>?<Parameter>=<Wert> übergeben.
 Jeder weitere Parameter kann mit '&' angehängt werden.
 Beantworten Sie folgende Fragen: Wie werden die Status-Codes festgelegt? Wo ist die Business-Logik implementiert?

## Übung: Untersuchen/Erweitern der Ressource "HelloWorldJsonResource"
1. Öffnen Sie die Klasse itech.resources.HelloWorldJsonResource . Schauen Sie sich den Ressourcen-Pfad an und rufen Ihn auf.
2. Erweitern Sie die JSON-Ausgabe um eine weitere  

## Übung: Prüfen Sie die Implementierung und Erweiterung des Clients
1. Öffnen Sie die Klasse itech.client.HelloWorldClient . Schauen Sie sich den Ressourcen-Pfad an und rufen Ihn auf.
2. Erläutern Sie einem Mitschüler oder eine Mitschülern, was bei dem Aufruf der Ressource passiert.
3. Erweitern Sie den Client so, dass die Ressource  itech.resources.HelloWorldResource#helloWorldGreetings konsumiert werden kann.

## App und Conf (yml) untersuchen

## Medientypen anfragen

## Datenbanken

## Messen, Steuern, Regeln

### Metriken, Threads, Healthcheck
1. Rufen Sie die URL http://localhost:18182 auf. Für welchen Szenarien sind die bereitgestellte Funktionalitäten denkbar? Erläutern Sie  sinnvolle Einsatzmöglichkeiten für 'Metrics', 'Threads' und 'Healthcheck' anhand von Beispielen.

### Dropwizard-Speicherverbrauch
1. Starten Sie den Dropwizard Service. Nutzen Sie VisualVM und monitoren Sie die Größe und die Nutzung des Heap-Speichers. Sie können mit Hilfe des Skripts scripts/performance_test_resource.sh für ein wenig Aktivität des Services sogen. Was sind die Minimal- und Maximalwerte? In welchem durchschnittlichen Bereich liegen die Werte ca.?
2. Starten Sie den Service und begrenzen Sie den minimalen und maximalen Heap-Speicher. Prüfen Sie dazu das Skript: scripts/itechDropAppStart.sh . Nutzen Sie VisualVM und monitoren Sie die Größe und die Nutzung des Heap-Speichers. Sie können mit Hilfe des Skripts scripts/performance_test_resource.sh für ein wenig Aktivität des Services sogen. Was sind die Minimal- und Maximalwerte? In welchem durchschnittlichen Bereich liegen die Werte ca.?
3. Vergleichen Sie die Messwerte aus Aufgabe 1 und 2 dieser Übung. Sind die Messwerte Ihrer Meinung nach beachtenswert? Begründen Sie!
