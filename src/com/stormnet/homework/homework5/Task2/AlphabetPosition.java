package com.stormnet.homework.homework5.Task2;

public enum AlphabetPosition {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    public int getLetterPosition() {
        int index = this.ordinal() + 1;
        return index;
    }
}
