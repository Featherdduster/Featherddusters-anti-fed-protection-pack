package moonshine.util;

@FunctionalInterface
public interface Process<T> {
	T process(T t);
}