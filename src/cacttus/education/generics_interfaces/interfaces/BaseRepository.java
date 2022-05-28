package cacttus.education.generics_interfaces.interfaces;

public interface BaseRepository<T, Tid> extends ReadableRepository<T, Tid>,
        WriteableRepository<T, Tid> {
}
