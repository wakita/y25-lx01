# C のサンプルプログラムのビルド
#   make        実行ファイル simple を作る
#   make run    simple を作って実行する
#   make clean  実行ファイルを削除する

CC     = cc
CFLAGS = -std=c99 -Wall -Wextra

simple: src/simple.c
	$(CC) $(CFLAGS) -o $@ $<

run: simple
	./simple

clean:
	rm -f simple

.PHONY: run clean
