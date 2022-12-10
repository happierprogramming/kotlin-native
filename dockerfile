FROM ubuntu
COPY ./build/bin/native/releaseExecutable/kotlin-native.kexe /kotlin-native
ENTRYPOINT ["/kotlin-native"]